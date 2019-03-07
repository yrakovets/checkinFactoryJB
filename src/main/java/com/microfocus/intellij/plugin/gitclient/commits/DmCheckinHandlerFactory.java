package com.microfocus.intellij.plugin.gitclient.commits;

import com.intellij.openapi.vcs.CheckinProjectPanel;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import git4idea.checkin.GitCheckinHandlerFactory;
import org.jetbrains.annotations.NotNull;

public class DmCheckinHandlerFactory extends GitCheckinHandlerFactory {
    private static DmCheckinHandler handler;

    public static DmCheckinHandler getHandler() {
        return handler;
    }

    @NotNull
    @Override
    protected CheckinHandler createVcsHandler(CheckinProjectPanel panel) {
        handler = new DmCheckinHandler(panel);
        return handler;
    }
}
