package com.gobeyond.firebase.model;

import com.gobeyond.firebase.document.FirebaseDocument;
import com.gobeyond.firebase.document.FirebaseId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FirebaseDocument("/albums")
public class Album {

    @FirebaseId
    private String id;

    private String title;

}
