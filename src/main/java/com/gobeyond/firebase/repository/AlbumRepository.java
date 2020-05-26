package com.gobeyond.firebase.repository;

import org.springframework.stereotype.Repository;

import com.gobeyond.firebase.model.Album;
import com.gobeyond.firebase.util.repository.DefaultFirebaseRealtimeDatabaseRepository;

@Repository
public class AlbumRepository extends DefaultFirebaseRealtimeDatabaseRepository<Album, String> {
}
