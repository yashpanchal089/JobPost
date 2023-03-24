package com.shayona.joblisting.repository;

import com.shayona.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
