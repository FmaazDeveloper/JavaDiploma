public class Translate{
	static String words [][] = 
			{
					 {"أ","a"}
					,{"حول","about"}
					,{"	الكل	","all"}
					,{"أيضا","also"}
					,{"و","and"}
					,{"مثل","as"}
					,{"في","at"}
					,{"يكون","be"}
					,{"لان","because"}
					,{"لكن","but"}
					,{"بواسطة","by"}
					,{"يستطيع","can"}
					,{"	تأت","come"}
					,{"استطاع","could"}
					,{"يوم","	day"}
					,{"فعل","do"}
					,{"حتىفي","even"}
					,{"تجد","find"}
					,{"أول","first"}
					,{"إلى","	for"}
					,{"من","	from"}
					,{"احصل على","get"}
					,{"يعطي","give"}
					,{"اذهب","go"}
					,{"يملك","have"}
					,{"هو","he"}
					,{"لها","her"}
					,{"هنا","here"}
					,{"له","him"}
					,{"له","his"}
					,{"كيف","how"}
					,{"أنا","I"}
					,{"إذا","if"}
					,{"في","in"}
					,{"إلى","into"}
					,{"عليه","it"}
					,{"انها","its"}
					,{"مجرد","	just	"}
					,{"أعرف","	know	"}
					,{"مثل","like"}
					,{"نظرة","look"}
					,{"يصنع","make"}
					,{"رجل","man"}
					,{"كثير","many"}
					,{"أنا","me"}
					,{"أكثر","more"}
					,{"لي","my"}
					,{"جديد","new"}
					,{"لا","no"}
					,{"ليس","not"}
					,{"الآن","now"}
					,{"من","of"}
					,{"على","on"}
					,{"واحد","one"}
					,{"فقط","only"}
					,{"أو","or"}
					,{"آخر","other"}
					,{"لنا","our"}
					,{"خارج","out"}
					,{"اشخاص","people"}
					,{"قل","say"}
					,{"نرى","see"}
					,{"هي","she"}
					,{"وبالتالي","so"}
					,{"بعض","some"}
					,{"يأخذ","take"}
					,{"يخبار","tell"}
					,{"من","than"}
					,{"ذلك","that"}
					,{"ال","the"}
					,{"هم","their"}
					,{"معهم","them"}
					,{"ثم","then"}
					,{"هناك","there"}
					,{"هؤلاء","these"}
					,{"هم","they"}
					,{"شيء","thing"}
					,{"يفكر","think"}
					,{"هذه","this"}
					,{"أولئك","those"}
					,{"زمن","time"}
					,{"إلى","to"}
					,{"اثنان","two"}
					,{"فوق","up"}
					,{"استعمال","use"}
					,{"	للغاية	","very"}
					,{"تريد","want"}
					,{"الطريق","way"}
					,{"نحن","we"}
					,{"حسنا","well"}
					,{"ماذا","what"}
					,{"متى","when"}
					,{"التي","which"}
					,{"مَن","	who"}
					,{"إرادة","will"}
					,{"مع","with"}
					,{"سيكون","would"}
					,{"عام","year"}
					,{"أنت","you"}
					,{"الخاص-بك","your"}
			};
public static String translate(String w1)
{
	for(String [] word:words) {
		if(word[1].equals(w1));
	    return word[0];	
	}
	return "NOT found";
}
	public static void main(String[] args) 
{
	 System.out.println(translate("go"));
}
}