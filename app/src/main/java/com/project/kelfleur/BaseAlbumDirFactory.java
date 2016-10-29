package com.project.kelfleur;

import android.os.Environment;

import java.io.File;

/**
 * Created by lucky on 29/10/2016.
 */
public class BaseAlbumDirFactory extends AlbumStorageDirFactory {
    // Standard storage location for digital camera files
    private static final String CAMERA_DIR = "/dcim/";

    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStorageDirectory()
                        + CAMERA_DIR
                        + albumName
        );
    }
}
