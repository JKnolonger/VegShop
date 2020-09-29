package com.huutin.api;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.huutin.dto.UploadFileDto;
import com.huutin.utils.UploadFileUtils;

@RestController
public class HomeAPI {
@Autowired
private UploadFileUtils uploadFileUtils;
	@PostMapping(value = "/api/home")
	public ResponseEntity<Void> uploadFile(@RequestBody UploadFileDto uploadFileDto){
		byte[] decodeBase64 = Base64.getDecoder().decode(uploadFileDto.getBase64().getBytes());
		uploadFileUtils.writeOrUpdate(decodeBase64, "/thumbnail/"+uploadFileDto.getName());
		return ResponseEntity.noContent().build();
	}

}
