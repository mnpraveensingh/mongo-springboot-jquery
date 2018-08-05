package com.justiceleague.justiceleaguemodule.service;

import java.util.List;

import com.justiceleague.justiceleaguemodule.domain.JusticeLeagueMemberDetail;
import com.justiceleague.justiceleaguemodule.web.dto.JusticeLeagueMemberDTO;

/**
 * This interface defines the functionality exposed on the justice league
 * management system.
 * 
 * @author dinuka
 *
 */
public interface JusticeLeagueMemberService {

	/**
	 * This method will add a new member to the system.
	 * 
	 * @param justiceLeagueMember
	 *            an instance of {@link JusticeLeagueMemberDTO} with the member
	 *            details.
	 */
	void addMember(final JusticeLeagueMemberDTO justiceLeagueMember);

	List<JusticeLeagueMemberDetail> findAll();

	JusticeLeagueMemberDetail findOne(String userId);
}
