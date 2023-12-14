package com.yupi.maker.meta;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-14  10:31
 * @Description: TODO
 * @Version: 1.0
 */
@NoArgsConstructor
@Data
public class Meta {
    private String name;
    private String description;
    private String basePackage;
    private String version;
    private String author;
    private String createTime;
    private FileConfig fileConfig;
    private ModelConfig modelConfig;

    @NoArgsConstructor
    @Data
    public static class FileConfig {
        private String inputRootPath;
        private String outputRootPath;
        private String type;
        private List<FilesInfo> files;

        @NoArgsConstructor
        @Data
        public static class FilesInfo {
            private String inputPath;
            private String outputPath;
            private String type;
            private String generateType;
        }
    }

    @NoArgsConstructor
    @Data
    public static class ModelConfig {
        private List<ModelsInfo> models;

        @NoArgsConstructor
        @Data
        public static class ModelsInfo {
            private String fieldName;
            private String type;
            private String description;
            private Object defaultValue;
            private String abbr;
        }
    }
}
