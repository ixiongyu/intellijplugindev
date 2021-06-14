package com.ixiongyu;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class HelloWorld extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // TODO: insert action logic here
        //获取得到当前的对象
        Project project = event.getData(PlatformDataKeys.PROJECT);

        //显示一个对话框 输入信息
        String info = Messages.showInputDialog(project, "请输入信息", "这是一个标题", Messages.getQuestionIcon());

        Messages.showMessageDialog(project, "Hello" + info, "Title" + info, Messages.getInformationIcon());
        //弹出对话框 输出输入的信息
    }
}
