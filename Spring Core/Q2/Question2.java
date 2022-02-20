package que2;

import java.util.Map;

public class Question2 {
	
	private  int questionId;
	private  String  question;
	private Map<Integer,String> answersMap;
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
	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	@Override
	public String toString() {
		return "Question2 [questionId=" + questionId + ", question=" + question + ", answersMap=" + answersMap + "]";
	}
	
	
	
	

}
