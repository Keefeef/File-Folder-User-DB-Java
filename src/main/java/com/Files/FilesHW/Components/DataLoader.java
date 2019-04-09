package com.Files.FilesHW.Components;

import com.Files.FilesHW.Models.File;
import com.Files.FilesHW.Models.Folder;
import com.Files.FilesHW.Models.User;
import com.Files.FilesHW.Repositories.FileRepository;
import com.Files.FilesHW.Repositories.FolderRepository;
import com.Files.FilesHW.Repositories.UserRepository;
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

    public void run(ApplicationArguments args){
        Folder codeclan = new Folder("Work");
        folderRepository.save(codeclan);

        File homework = new File("homework", ".java", 20, codeclan);
        fileRepository.save(homework);

        User ethan = new User("Ethan");
        userRepository.save(ethan);


        codeclan.addFile(homework);
        folderRepository.save(codeclan);

        codeclan.addUser(ethan);
        folderRepository.save(codeclan);

        ethan.addToFolders(codeclan);
        userRepository.save(ethan);






    }

}
