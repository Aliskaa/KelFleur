package com.project.kelfleur;

import java.io.File;

/**
 * Created by lucky on 29/10/2016.
 */
abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
