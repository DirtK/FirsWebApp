package ru.moneybranch.webapp.model.prosperity;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.auxiliary.Utils;
import ru.moneybranch.webapp.interfaces.Skilsable;

import java.util.Arrays;
import java.util.List;

import static ru.moneybranch.webapp.auxiliary.Utils.makeTabulation;
import static ru.moneybranch.webapp.auxiliary.Utils.printArrItem;

/**
 * stanley
 * 04.01.18.
 */
public class Skills extends Successfulness implements Skilsable {

   private List<String> subTitleList;
   private List<String> applicationServerList;
   private List<String> versionControlList;
   private List<String> dataBaseList;
   private List<String> languageList;
   private List<String> frameworkList;
   private List<String> technologyList;
   private List<String> instrumentList;
   private String other;

    public Skills() {
    }

    public Skills(List<String> progressList, List<String> subTitleList, List<String> applicationServerList, List<String> versionControlList, List<String> dataBaseList,
                  List<String> languageList, List<String> frameworkList, List<String> technologyList, List<String> instrumentList, String other) {
        super(progressList);
        this.subTitleList = subTitleList;
        this.applicationServerList = applicationServerList;
        this.versionControlList = versionControlList;
        this.dataBaseList = dataBaseList;
        this.languageList = languageList;
        this.frameworkList = frameworkList;
        this.technologyList = technologyList;
        this.instrumentList = instrumentList;
        this.other = other;
    }

    @Override
    public List<String> getProgressList() {



        return super.getProgressList();
    }

    @Override
    public void setProgressList(List<String> progressList) {
        super.setProgressList(progressList);
    }

    @Override
    public List<String> getSubTitleList() {
        return subTitleList;
    }

    @Override
    public void setSubTitleList(List<String> subTitleList) {
        this.subTitleList = subTitleList;
    }

    @Override
    public List<String> getApplicationServerList() {
        return applicationServerList;
    }

    @Override
    public void setApplicationServerList(List<String> applicationServerList) {
        this.applicationServerList =applicationServerList;
    }

    @Override
    public List<String> getVersionControlList() {
        return versionControlList;
    }

    @Override
    public void setVersionControlList(List<String> versionControlList) {
        this.versionControlList = versionControlList;
    }

    @Override
    public List<String> getDataBaseList() {
        return dataBaseList;
    }

    @Override
    public void setDataBaseList(List<String> dataBaseList) {
        this.dataBaseList = dataBaseList;
    }

    @Override
    public List<String> getLanguageList() {
        return languageList;
    }

    @Override
    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    @Override
    public List<String> getFrameworkList() {
        return frameworkList;
    }

    @Override
    public void setFrameworkList(List<String> frameworkList) {
        this.frameworkList = frameworkList;
    }

    @Override
    public List<String> getTechnologyList() {
        return technologyList;
    }

    @Override
    public void setTechnologyList(List<String> technologyList) {
        this.technologyList = technologyList;
    }

    @Override
    public List<String> getInstrumentList() {
        return instrumentList;
    }

    @Override
    public void setInstrumentList(List<String> instrumentList) {
        this.instrumentList = instrumentList;
    }

    @Override
    public String getOther() {
        return other;
    }

    @Override
    public void setOther(String other) {
        this.other = other;
    }






}
