package com.example.begrateful;

import java.util.ArrayList;

public class Question {
    private static final char DEPRESSION = 'd';
    private static final char STRESS = 's';
    private static final char ANXIETY = 'a';
    private String question;
    private char type;
    private static ArrayList<Question> questionnaire;
    private static Question q = null;

    private Question() {
        addQuestions();
    }

    private void addQuestions(){
        questionnaire = new ArrayList<>();
        questionnaire.add(new Question('s', "I found it hard to wind down"));
        questionnaire.add(new Question('a', "I was aware of dryness of my mouth"));
        questionnaire.add(new Question('d', "I couldn't seem to experience any positive feeling at all"));
        questionnaire.add(new Question('a',"I experienced breathing difficulty (e.g. excessively rapid breathing, breathlessness in the absence of physical exertion)"));
        questionnaire.add(new Question('d', "I found it difficult to work up the initiative to do things"));
        questionnaire.add(new Question('s', "I tended to over-react to situations"));
        questionnaire.add(new Question('a', "I experienced trembling (e.g. in the hands)"));
        questionnaire.add(new Question('s', "I felt that I was using a lot of nervous energy"));
        questionnaire.add(new Question('a', "I was worried about situations in which I might panic and make a fool of myself"));
        questionnaire.add(new Question('d', "I felt that I had nothing to look forward to"));
        questionnaire.add(new  Question('s', "I found myself getting agitated"));
        questionnaire.add(new  Question('s', "I found it difficult to relax"));
        questionnaire.add(new  Question('d', "I felt down-hearted and blue"));
        questionnaire.add(new  Question('s', "I was intolerant of anything that kept me from getting on with what I was doing"));
        questionnaire.add(new  Question('a', "I felt I was close to panic"));
        questionnaire.add(new  Question('d', "I was unable to become enthusiastic about anything"));
        questionnaire.add(new  Question('d', "I felt I wasn't worth much as a person"));
        questionnaire.add(new  Question('s', "I felt that I was rather touchy"));
        questionnaire.add(new  Question('a', "I was aware of the action of my heart in the absence of physical exertion (e.g. sense of heart rate increase, heart missing a beat)"));
        questionnaire.add(new  Question('a', "I felt scared without any good reason"));
        questionnaire.add(new  Question('d', "I felt that life was meaningless"));
    }

    public static Question getInstance(){
        return q==null? new Question():q;
    }

    public Question at(int i){
        return i<21 && i>=0? questionnaire.get(i):null;
    }

    private Question(char type,String question) {
        this.question = question;
        this.type = type;
    }

    public Character getType() {
        return type;
    }
    public String getQuestion() {
        return question;
    }
}
