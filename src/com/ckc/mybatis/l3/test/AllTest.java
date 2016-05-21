package com.ckc.mybatis.l3.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
/*import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;*/
import org.junit.Test;
import com.ckc.mybatis.l3.domain.Song;
import com.ckc.mybatis.l3.mapper.SongMapper;
import com.ckc.mybatis.l3.util.SqlSessionFactoryUtil;

public class AllTest
{
	private static Logger logger=Logger.getLogger(AllTest.class);
	// 查询所有
	@Test
	public void test01()
	{
		// 保存sqlSession
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		SongMapper songMapper=sqlSession.getMapper(SongMapper.class);
		List<Song> songs = songMapper.selectAllSongs();
		if (songs.size()>0&&songs!=null)
		{
			for (Song song : songs)
			{
				System.err.println(song);
			}
			logger.info("成功！");
		} else
		{
			logger.info("没有查询到任何数据！");
		}
		
		
		sqlSession.close();
	}

	// 查询所有
	@Test
	public void test02()
	{
		// 保存sqlSession
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		List<Song> songs = sqlSession.selectList("com.ckc.mybatis.l3.mapper.SongMapper.selectAllSongswitheJoin");
		for (Song song : songs)
		{
			System.err.println(song);
		}

	}

}