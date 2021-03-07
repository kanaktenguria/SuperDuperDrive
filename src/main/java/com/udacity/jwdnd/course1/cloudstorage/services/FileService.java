package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mappers.FileMapper;
import com.udacity.jwdnd.course1.cloudstorage.models.File;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    private FileMapper fileMapper;

    public FileService(FileMapper fileMapper) {
        this.fileMapper = fileMapper;
    }

    public List<File> getAllFiles(int userid){
        return this.fileMapper.getAllFiles(userid);
    }

    public int insertFile(File file) {
        return this.fileMapper.insertFile(file);
    }

    public void deleteFile(Integer fileId) {
        this.fileMapper.deleteFile(fileId);
    }

    public File getFiles(Integer userid, Integer fileId) {
        return this.fileMapper.getFile(userid, fileId);
    }
}
