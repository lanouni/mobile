package com.example.quizapp_21;

public class ModelClass {

    String question;
    String oA;
    String OB;
    String OC;
    String oD;
    String ans;

    public ModelClass(String question, String oA, String OB, String OC, String oD, String ans) {
        this.question = question;
        this.oA = oA;
        this.OB = OB;
        this.OC = OC;
        this.oD = oD;
        this.ans = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getoA() {
        return oA;
    }

    public void setoA(String oA) {
        this.oA = oA;
    }

    public String getOB() {
        return OB;
    }

    public void setOB(String OB) {
        this.OB = OB;
    }

    public String getOC() {
        return OC;
    }

    public void setOC(String OC) {
        this.OC = OC;
    }

    public String getoD() {
        return oD;
    }

    public void setoD(String oD) {
        this.oD = oD;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
