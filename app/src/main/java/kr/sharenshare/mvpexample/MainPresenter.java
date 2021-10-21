package kr.sharenshare.mvpexample;

//contract presenter 상속
public class MainPresenter implements Contract.Presenter{
    Contract.View view;
    MainModel mainModel;

    public MainPresenter(Contract.View view){
        this.view = view;
        mainModel = new MainModel(this); //모델과 통신하기 위해 객체 생성
    }

    @Override
    public void addNum(int num1, int num2) {
        view.showResult(num1 + num2);
    }
}
