package com.Files.FilesHW.Projections;

import com.Files.FilesHW.Models.File;
import com.Files.FilesHW.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
