package racingcar;

enum ExceptionCase {
    INPUT_UNGIVEN("입력이 주어지지 않음"),
    CAR_NAME_LENGTH_OVERED("자동차 이름 길이 초과"),
    CAR_NAME_DUPLICATION("자동차 이름 중복"),
    CAR_NAME_HAS_BLANK("자동차 이름 공백이 포함됨"),
    UNNAMED_CAR_EXIST("이름 없는 자동차 존재"),
    INPUT_TYPE_MISMATCH("입력 형식 오류"),
    INPUT_NUMBER_RANGE_MISMATCH("입력 숫자 범위 오류");

    private final String message;

    ExceptionCase(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
