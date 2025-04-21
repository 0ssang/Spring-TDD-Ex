package com.ys.tddspringex.user;

/**
 * packageName    : com.ys.tddspringex.user
 * fileName       : PubilcStatus
 * author         : 조영상
 * date           : 4/21/25
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/21/25         조영상        최초 생성
 */
public enum PublicStatus {
    PUBLIC("공개", "모든 사용자가 볼 수 있는 게시물"),
    PRIVATE("비공개", "작성자만 볼 수 있는 게시물"),
    DRAFT("임시저장", "작성 중인 게시물"),
    RESTRICTED("제한공개", "특정 그룹이나 권한을 가진 사용자만 볼 수 있는 게시물"),
    DELETED("삭제됨", "삭제된 게시물");

    private final String title;
    private final String description;

    PublicStatus(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
