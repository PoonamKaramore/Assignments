package que2;

import java.util.Set;

public class Question1 {
	
	private  int questionId;
	private  String  question;
	private Set<String>  answersSet;
	 
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswersSet() {
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	@Override
	public String toString() {
		return "Question1 [questionId=" + questionId + ", question=" + question + ", answersSet=" + answersSet + "]";
	}
	 
	 

}
