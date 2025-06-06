package com._yp.gaitMate.service.testSessionService;

import com._yp.gaitMate.dto.ApiResponse;
import com._yp.gaitMate.dto.testSession.TestSessionActionDto;
import com._yp.gaitMate.dto.testSession.StartTestSessionResponse;
import com._yp.gaitMate.dto.testSession.TestSessionDetailsResponse;

import java.util.List;

public interface TestSessionService {
    StartTestSessionResponse startSession(TestSessionActionDto request);

    ApiResponse stopSession(Long sessionId, TestSessionActionDto request);

    TestSessionDetailsResponse getTestSessionById(Long sessionId);

    List<TestSessionDetailsResponse> getSessionsOfLoggedInPatient();

    List<TestSessionDetailsResponse> getSessionsByIdOfPatientsOfLoggedInDoctor(Long id);
}
