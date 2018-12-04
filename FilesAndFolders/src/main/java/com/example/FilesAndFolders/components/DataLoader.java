package com.example.FilesAndFolders.components;

import com.example.FilesAndFolders.models.File;
import com.example.FilesAndFolders.models.Folder;
import com.example.FilesAndFolders.models.User;
import com.example.FilesAndFolders.repositories.FileRepository;
import com.example.FilesAndFolders.repositories.FolderRepository;
import com.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User ted = new User("Ted");
        userRepository.save(ted);

        Folder java = new Folder("Java Projects", ted);
        folderRepository.save(java);

        Folder ruby = new Folder("Ruby Projects", ted);
        folderRepository.save(ruby);

        File pirates = new File("Java Pirates", "java", 2, java);
        fileRepository.save(pirates);

        File monsters = new File("Ruby monsters", "ruby", 5, ruby);
        fileRepository.save(monsters);
    }
}
