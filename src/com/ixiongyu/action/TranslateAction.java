package com.ixiongyu.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.ixiongyu.translate.impl.YouDaoTranslate;
import org.apache.commons.lang3.StringUtils;

public class TranslateAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        // TODO: insert action logic here
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        if (StringUtils.isNotBlank(selectedText)) {
            String translate = YouDaoTranslate.translate(selectedText);
            System.out.println(translate);
        }
    }
}
