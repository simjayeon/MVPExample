package kr.sharenshare.mvpexample;

import org.json.JSONObject;

//View와 Presenter의 Interface
//View와 Presenter가 무슨 기능을 할지 미리 명세해주는 역할
//작성 후 implement 하여 사용
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
