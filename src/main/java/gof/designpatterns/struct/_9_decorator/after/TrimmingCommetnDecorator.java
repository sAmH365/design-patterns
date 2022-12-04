package gof.designpatterns.struct._9_decorator.after;

public class TrimmingCommetnDecorator extends CommentDecorator{
    public TrimmingCommetnDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...","");
    }

}
