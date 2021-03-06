package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.FreeBoard;
import com.ssafyns.vo.FreeBoardComment;

public interface FreeBoardCommentService {

	FreeBoardComment getFreeBoardComment(int fbcomment_no);

	List<FreeBoardComment> getFreeBoardCommentList();

	void createFreeBoardComment(FreeBoardComment freeBoardComment);

	void modifyFreeBoardComment(FreeBoardComment freeBoardComment);

	void destroyFreeBoardComment(int fbcomment_no);

}