package com.ckc.mybatis.l3.mapper;

import java.util.List;

import com.ckc.mybatis.l3.domain.Song;

public interface SongMapper {
	List<Song> selectAllSongs();
}
