package ru.moneybranch.webapp.model.prosperity;

import ru.moneybranch.webapp.interfaces.PracticalSkills;

import java.util.List;

/**
 * stanley
 * 04.01.18.
 */
public abstract class Successfulness implements PracticalSkills {


    private List<String> progressList;

    public Successfulness() {
    }

    public Successfulness(List<String> progressList) {

        this.progressList = progressList;
    }



    @Override
    public List<String> getProgressList() {
        return progressList;
    }

    @Override
    public void setProgressList(List<String> progressList) {
        this.progressList = progressList;
    }


}
