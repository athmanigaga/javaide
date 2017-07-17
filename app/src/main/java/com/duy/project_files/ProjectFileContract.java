package com.duy.project_files;

import android.support.annotation.Nullable;

import java.io.File;

/**
 * Created by Duy on 17-Jul-17.
 */

public class ProjectFileContract {
    public interface View {
        void display(ProjectFile projectFile);

        void refresh();

        void setPresenter(Presenter presenter);
    }

    public interface Presenter {
        void show(ProjectFile projectFile);

        void refresh();
    }

    public interface ActionCallback {
        void onSuccess(File newf);

        void onFailed(@Nullable Exception e);
    }


    public interface FileActionListener {
        void onFileClick(File file, ActionCallback callBack);

        void onFileLongClick(File file, ActionCallback callBack);

        boolean doRemoveFile(File file, ActionCallback callBack);

        boolean doCreateNewFile(File file, ActionCallback callBack);
    }
}
