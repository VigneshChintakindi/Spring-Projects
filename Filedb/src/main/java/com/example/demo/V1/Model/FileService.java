package com.example.demo.V1.Model;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	Filedb store(MultipartFile file) throws IOException ;
	Filedb getFile(String id);
	Stream<Filedb> getAllFiles();
}
