package com.tyss.instance.variable;

public class TestMarks {
public static void main(String[] args) {
	Marks marks = new Marks();
	marks.englishMarks=25;
	marks.mathsMarks=57;
	marks.scienceMarks=77;
	System.out.println(marks.englishMarks);
	System.out.println(marks.mathsMarks);
	System.out.println(marks.scienceMarks);
	Marks mark = new Marks();
	mark.englishMarks=99;
	mark.mathsMarks=88;
	mark.scienceMarks=99;
	System.out.println(mark.englishMarks);
	System.out.println(mark.mathsMarks);
	System.out.println(mark.scienceMarks);
	Marks m=marks;
	m.englishMarks=12;
	m.mathsMarks=13;
	m.scienceMarks=17;
	System.out.println(m.englishMarks);
	System.out.println(m.mathsMarks);
	System.out.println(m.scienceMarks);
}
}
