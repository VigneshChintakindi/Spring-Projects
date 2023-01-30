package com.example.demo.V1.Model;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl {
	
	@Autowired
	  private FileRepo fileRepo;

	  public Filedb store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    Filedb Filedb = new Filedb(fileName, file.getContentType(), file.getBytes());

	    return fileRepo.save(Filedb);
	  }

	  public Filedb getFile(String id) {
	    return fileRepo.findById(id).get();
	  }
	  
	  public Stream<Filedb> getAllFiles() {
	    return fileRepo.findAll().stream();
	  }
}
