package se_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import se_01.Project;

public class Test2 {
Project simple_example, simple_cycle, complex_cycle, complex_graph;
  
@Before
public void setUp(){
	simple_example = new Project(
		new String[][]{{"A","B"},{"C","D"}}
	);
	
	simple_cycle = new Project(new String[][]{{"A","A"}});
	
	complex_cycle = new Project(new String[][]{{"C","D"},{"D","C"}});
	
	complex_graph = new Project(
			new String[][]{{"A","B"},{"C","D"},{"F","A"},{"E","G"},{"G","A"}}
	);
}

@Test
public void test_simple_example_1(){
	assertTrue(simple_example.isWellSorted(new String[]{"A","C","D","B"}));
}

public void test_simple_example_2(){
	assertFalse(simple_example.isWellSorted(new String[]{"A","B","D","C"}));
}

}
