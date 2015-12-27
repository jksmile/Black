package com.xjk.project.admin.dao;

import com.xjk.project.admin.model.ConsumerModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Intro:
 * Project: Black
 * Date:    12/27/15
 * Author:  xujinkai
 */

@Repository
public interface ConsumerDao {

	ArrayList<ConsumerModel> selectAllConsumer();

	
}
