public class Chatbot {
    private String nameNow;
    private String nameOld;

    public void greeting(){
        System.out.println("はじめまして"+nameNow+"です、よろしくお願いします。");
    }

    public Chatbot(){
        System.out.println("コンストラクタ：new直後に実行されるプログラム");
    }
    public Chatbot(String name){
        this.nameNow = name;
        System.out.println("チャットボット名"+nameNow+"を作成します。");
    }
    public void setName(String _name){
        if(_name == "差別用語"){
            System.out.println("禁止されています");
        }else{
            this.nameOld = this.nameNow;
            this.nameNow = _name;
            System.out.println(nameOld+"から"+nameNow+"へと変更しまっす");
        }
    }
}