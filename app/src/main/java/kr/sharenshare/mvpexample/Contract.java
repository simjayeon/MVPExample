package kr.sharenshare.mvpexample;

import org.json.JSONObject;

//View와 Presenter의 Interface
public interface Contract {
    //결과를 보여주는 일
    interface View{
        void showResult(int answer);
    }

    //계산을 해주는 일
    interface Presenter {
        void addNum(int num1, int num2);
    }
}
