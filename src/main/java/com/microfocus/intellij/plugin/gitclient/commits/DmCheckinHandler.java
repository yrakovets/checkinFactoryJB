package com.microfocus.intellij.plugin.gitclient.commits;

import com.intellij.openapi.vcs.CheckinProjectPanel;
import com.intellij.openapi.vcs.checkin.CheckinHandler;

import javax.swing.*;

public class DmCheckinHandler extends CheckinHandler {
    public DmCheckinHandler(CheckinProjectPanel panel) {

    }

    @Override
    public ReturnResult beforeCheckin() {
        //TODO
        JOptionPane.showMessageDialog(null, "beforeCheckin() called");
        return ReturnResult.COMMIT;
    }
}
