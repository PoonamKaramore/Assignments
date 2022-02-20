package que2;

import java.util.List;


public class Question {
	
    private  int questionId;
    private  String  question;
    private List<String> answers;

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

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	

	/*public void Answerlist() {
		 System.out.println(questionId+". "+question);
	        for(String ans:answers){
	            System.out.println(ans);
	      }*/
	}   
   
