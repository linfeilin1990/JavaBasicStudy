package com.linxitec.study.designpattern.commandPattern;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.add();
        super.pageGroup.plan();
    }
}
