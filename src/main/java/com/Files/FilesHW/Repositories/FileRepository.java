package com.Files.FilesHW.Repositories;

import com.Files.FilesHW.Models.File;
import com.Files.FilesHW.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
