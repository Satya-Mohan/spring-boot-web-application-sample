package gt.app.modules.article;

import gt.app.domain.ArticleStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Data
public class ArticleReviewReadDto {

    private Long id;

    private String title;

    private ArticleStatus status;

    private String content;

    private UUID userId;
    private String username;

    private Instant createdDate;

    private List<FileInfo> files = new ArrayList<>();

    @Data
    @NoArgsConstructor
    public static class FileInfo {
        UUID id;
        String name;
    }

}
