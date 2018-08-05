package com.justiceleague.justiceleaguemodule.web.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.justiceleague.justiceleaguemodule.constants.MessageConstants;
import com.justiceleague.justiceleaguemodule.dao.JusticeLeagueRepository;
import com.justiceleague.justiceleaguemodule.domain.JusticeLeagueMemberDetail;
import com.justiceleague.justiceleaguemodule.service.JusticeLeagueMemberService;
import com.justiceleague.justiceleaguemodule.web.dto.JusticeLeagueMemberDTO;
import com.justiceleague.justiceleaguemodule.web.dto.ResponseDTO;

/**
 * This class exposes the REST API for the system.
 * 
 * @author dinuka
 *
 */
@RestController
@RequestMapping("/justiceleague")
public class JusticeLeagueManagementController {

	@Autowired
	private JusticeLeagueMemberService memberService;

	@Autowired
	private JusticeLeagueRepository justiceLeagueRepo;

	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST, path = "/addMember", produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseDTO addJusticeLeagueMember(@Valid @RequestBody JusticeLeagueMemberDTO justiceLeagueMember) {
		ResponseDTO responseDTO = new ResponseDTO(ResponseDTO.Status.SUCCESS,
				MessageConstants.MEMBER_ADDED_SUCCESSFULLY);
		try {
			memberService.addMember(justiceLeagueMember);
		} catch (Exception e) {
			responseDTO.setStatus(ResponseDTO.Status.FAIL);
			responseDTO.setMessage(e.getMessage());
		}
		return responseDTO;
	}

	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public List<JusticeLeagueMemberDetail> getAllUser() {
		return memberService.findAll();

	}

	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.GET, value = "/getById/{id}")
	public JusticeLeagueMemberDetail getById(@PathVariable String userId) {
		return justiceLeagueRepo.findBySuperHeroName(userId);

		// return justiceLeagueRepo.findOne(new
		// Query(Criteria.where("fname").is(userId)), JusticeLeagueMemberDetail.class);

	}

	@RequestMapping(value = "/get/{id}")
	public JusticeLeagueMemberDetail read(@PathVariable String id) {
		return justiceLeagueRepo.findOne(id);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody JusticeLeagueMemberDetail user) {
		justiceLeagueRepo.save(user);
	}

	@RequestMapping(value = "/create1", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody JusticeLeagueMemberDetail user) {
		justiceLeagueRepo.save(user);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deletePet(@PathVariable String id) {
		justiceLeagueRepo.delete(justiceLeagueRepo.findOne(id));
	}
}
