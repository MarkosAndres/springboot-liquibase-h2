package com.markos.springbootliquibaseh2.service;

import com.markos.springbootliquibaseh2.configuration.ApplicationConfiguration;
import com.markos.springbootliquibaseh2.entity.Task;
import com.markos.springbootliquibaseh2.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
//@SpringBootTest(classes = ApplicationConfiguration.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class TaskServiceUnitTest {

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private TaskRepository taskRepository;

	@Test
	public void saveTaskRepository() {
		Task task = new Task();
		task.setId(11L);
		task.setCompleted(true);
		task.setDescription("some desc 1");
		Task save = taskRepository.save(task);
		Assert.assertNotNull(save);

		Task res = taskRepository.findOne(1L);
		Assert.assertNotNull(res);
	}

	@Test
	public void saveTaskEntityManager() {
		Task task = new Task();
		task.setCompleted(true);
		task.setDescription("some desc 1");
		testEntityManager.persist(task);

		Task res = taskRepository.findOne(10L);
		Assert.assertNotNull(res);
	}
}
