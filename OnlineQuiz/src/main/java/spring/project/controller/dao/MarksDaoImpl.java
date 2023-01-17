package spring.project.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.project.model.DataOfMarks;

@Component
public class MarksDaoImpl {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insertMarks(DataOfMarks marks) {
		this.hibernateTemplate.saveOrUpdate(marks);
	}

	public List<DataOfMarks> getAllMarks() {
		List<DataOfMarks> loadAll = this.hibernateTemplate.loadAll(DataOfMarks.class);
		return loadAll;
	}
	
	public DataOfMarks getMarksById(int id) {
		DataOfMarks marks = this.hibernateTemplate.get(DataOfMarks.class, id);
		return marks;
	}
	
	public int getMarks(String name) {
		List<DataOfMarks> list = getAllMarks();
		for(DataOfMarks data : list) {
			if(data.getName().equals(null)) {
				delete(data.getId());
			}
			if(data.getName().equals(name)) {
				return data.getMarks();
			}
		}
		return 0;
	}
	
	public DataOfMarks getMarks(int id) {
		return this.hibernateTemplate.get(DataOfMarks.class, id);
	}
	
	@Transactional
	public void delete(int id) {
		DataOfMarks marks = getMarks(id);
		this.hibernateTemplate.delete(marks);
	}

}