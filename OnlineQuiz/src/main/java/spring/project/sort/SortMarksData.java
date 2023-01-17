package spring.project.sort;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

import spring.project.model.DataOfMarks;

@Component
public class SortMarksData {
	
	public List<DataOfMarks> sort(List<DataOfMarks> list){
		
		list.sort(new Comparator<DataOfMarks>() {

			@Override
			public int compare(DataOfMarks o1, DataOfMarks o2) {
				if(o1.getMarks() == o2.getMarks()) {
					if(o1.getName().equals(o2.getName())) {
						if(o1.getId() < o2.getId()) return 1;
						return -1;
					}
				}
				else if(o1.getMarks() < o2.getMarks()) return 1;
				return -1;
			}
		});
		
		return list;
		
	}

}
