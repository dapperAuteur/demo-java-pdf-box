package com.awe.BuildingRESTServices.bookmarks;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);

}
