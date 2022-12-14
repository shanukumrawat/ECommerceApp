package com.OrderManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OrderManagement.module.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback, Integer> {

	@Query("select c from Feedback c where id=?1 and User_Id=?2")
	public Feedback getfeedbackByIdandUser(Integer id, Integer userid);

	@Query("select c from Feedback c where User_Id=?1 and Product_Id=?2")
	public List<Feedback> getFeedBackByUserProduct(Integer userId, Integer productId);
	
	@Query("select c from Feedback c where Product_Id=?1")
	public List<Feedback> getFeedBackByProduct(Integer productId);
}
