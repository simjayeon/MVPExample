package kr.sharenshare.mvpexample;

import java.util.HashMap;
import java.util.Map;

public class MainModel {
    Contract.Presenter presenter;
    public MainModel(Contract.Presenter presenter){
        this.presenter = presenter;
    }
}
