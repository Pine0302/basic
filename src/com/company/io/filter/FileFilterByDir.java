package com.company.io.filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterByDir implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        return pathname.isDirectory();
    }
}
