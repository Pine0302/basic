package com.company.io.filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileNameFilterBySuffix implements FilenameFilter {

    private String suffix;

    public FileNameFilterBySuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.suffix);
    }
}
