package org.kkbp.dao;

import org.kkbp.interfaces.Operation;
import org.kkbp.models.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentDAO implements Operation {
    private ArrayList<Student> list = new ArrayList<>();
    /**
     *
     * @param object
     */
    @Override
    public void create(Object object) {
        try {
            Student student = (Student) object;
            list.add(student);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Object> read() {
        // no usar casting
        // ArrayList<Object> list = (ArrayList<Object>) this.list.clone();
        return null;
    }

    public ArrayList<Student> showList() {
        return list;
    }

    /**
     *
     * @param object
     */
    @Override
    public void update(Object object) {
        // Updates student
        Student student = (Student) object;

        for (Student st : list) {
            if(st.getCif().equals(student.getCif())) {
                st.setNames(student.getNames());
                st.setLastnames(student.getLastnames());
                st.setEmail(student.getEmail());
                st.setTelephone(student.getTelephone());
                return;
            }
        }
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete(String id) {
        for(Student st : list) {
            if(st.getCif().equals(id)) {
                list.remove(st);
                return;
            }
        }
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public Object search(String value) {
        for(Student st : list) {
            if(st.getCif().equals(value) || st.getNames().equals(value)) {
                return st;
            }
        }
        return null;
    }
}
