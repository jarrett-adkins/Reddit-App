
package com.example.admin.redditapplication.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Parcelable
{

    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("approved_at_utc")
    @Expose
    private Object approvedAtUtc;
    @SerializedName("banned_by")
    @Expose
    private Object bannedBy;
    @SerializedName("media_embed")
    @Expose
    private MediaEmbed mediaEmbed;
    @SerializedName("thumbnail_width")
    @Expose
    private Integer thumbnailWidth;
    @SerializedName("subreddit")
    @Expose
    private String subreddit;
    @SerializedName("selftext_html")
    @Expose
    private Object selftextHtml;
    @SerializedName("selftext")
    @Expose
    private String selftext;
    @SerializedName("likes")
    @Expose
    private Object likes;
    @SerializedName("suggested_sort")
    @Expose
    private Object suggestedSort;
    @SerializedName("user_reports")
    @Expose
    private List<Object> userReports = null;
    @SerializedName("secure_media")
    @Expose
    private SecureMedia secureMedia;
    @SerializedName("is_reddit_media_domain")
    @Expose
    private Boolean isRedditMediaDomain;
    @SerializedName("link_flair_text")
    @Expose
    private Object linkFlairText;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("banned_at_utc")
    @Expose
    private Object bannedAtUtc;
    @SerializedName("view_count")
    @Expose
    private Object viewCount;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("clicked")
    @Expose
    private Boolean clicked;
    @SerializedName("report_reasons")
    @Expose
    private Object reportReasons;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("num_crossposts")
    @Expose
    private Integer numCrossposts;
    @SerializedName("saved")
    @Expose
    private Boolean saved;
    @SerializedName("mod_reports")
    @Expose
    private List<Object> modReports = null;
    @SerializedName("can_mod_post")
    @Expose
    private Boolean canModPost;
    @SerializedName("is_crosspostable")
    @Expose
    private Boolean isCrosspostable;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("approved_by")
    @Expose
    private Object approvedBy;
    @SerializedName("over_18")
    @Expose
    private Boolean over18;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("subreddit_id")
    @Expose
    private String subredditId;
    @SerializedName("edited")
    @Expose
    private Boolean edited;
    @SerializedName("link_flair_css_class")
    @Expose
    private Object linkFlairCssClass;
    @SerializedName("author_flair_css_class")
    @Expose
    private Object authorFlairCssClass;
    @SerializedName("contest_mode")
    @Expose
    private Boolean contestMode;
    @SerializedName("gilded")
    @Expose
    private Integer gilded;
    @SerializedName("downs")
    @Expose
    private Integer downs;
    @SerializedName("brand_safe")
    @Expose
    private Boolean brandSafe;
    @SerializedName("secure_media_embed")
    @Expose
    private SecureMediaEmbed secureMediaEmbed;
    @SerializedName("removal_reason")
    @Expose
    private Object removalReason;
    @SerializedName("post_hint")
    @Expose
    private String postHint;
    @SerializedName("author_flair_text")
    @Expose
    private Object authorFlairText;
    @SerializedName("stickied")
    @Expose
    private Boolean stickied;
    @SerializedName("can_gild")
    @Expose
    private Boolean canGild;
    @SerializedName("thumbnail_height")
    @Expose
    private Integer thumbnailHeight;
    @SerializedName("parent_whitelist_status")
    @Expose
    private String parentWhitelistStatus;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("spoiler")
    @Expose
    private Boolean spoiler;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("subreddit_type")
    @Expose
    private String subredditType;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("hide_score")
    @Expose
    private Boolean hideScore;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("quarantine")
    @Expose
    private Boolean quarantine;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("created_utc")
    @Expose
    private Integer createdUtc;
    @SerializedName("subreddit_name_prefixed")
    @Expose
    private String subredditNamePrefixed;
    @SerializedName("ups")
    @Expose
    private Integer ups;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("num_comments")
    @Expose
    private Integer numComments;
    @SerializedName("is_self")
    @Expose
    private Boolean isSelf;
    @SerializedName("visited")
    @Expose
    private Boolean visited;
    @SerializedName("num_reports")
    @Expose
    private Object numReports;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("distinguished")
    @Expose
    private Object distinguished;
    public final static Parcelable.Creator<Data_> CREATOR = new Creator<Data_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data_ createFromParcel(Parcel in) {
            return new Data_(in);
        }

        public Data_[] newArray(int size) {
            return (new Data_[size]);
        }

    }
    ;

    protected Data_(Parcel in) {
        this.domain = ((String) in.readValue((String.class.getClassLoader())));
        this.approvedAtUtc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bannedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mediaEmbed = ((MediaEmbed) in.readValue((MediaEmbed.class.getClassLoader())));
        this.thumbnailWidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.subreddit = ((String) in.readValue((String.class.getClassLoader())));
        this.selftextHtml = ((Object) in.readValue((Object.class.getClassLoader())));
        this.selftext = ((String) in.readValue((String.class.getClassLoader())));
        this.likes = ((Object) in.readValue((Object.class.getClassLoader())));
        this.suggestedSort = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.userReports, (java.lang.Object.class.getClassLoader()));
        this.secureMedia = ((SecureMedia) in.readValue((SecureMedia.class.getClassLoader())));
        this.isRedditMediaDomain = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.linkFlairText = ((Object) in.readValue((Object.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.bannedAtUtc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.viewCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.archived = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.clicked = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.reportReasons = ((Object) in.readValue((Object.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.numCrossposts = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.saved = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.modReports, (java.lang.Object.class.getClassLoader()));
        this.canModPost = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isCrosspostable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.pinned = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.score = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.approvedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.over18 = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hidden = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.preview = ((Preview) in.readValue((Preview.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.subredditId = ((String) in.readValue((String.class.getClassLoader())));
        this.edited = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.linkFlairCssClass = ((Object) in.readValue((Object.class.getClassLoader())));
        this.authorFlairCssClass = ((Object) in.readValue((Object.class.getClassLoader())));
        this.contestMode = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.gilded = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.downs = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.brandSafe = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.secureMediaEmbed = ((SecureMediaEmbed) in.readValue((SecureMediaEmbed.class.getClassLoader())));
        this.removalReason = ((Object) in.readValue((Object.class.getClassLoader())));
        this.postHint = ((String) in.readValue((String.class.getClassLoader())));
        this.authorFlairText = ((Object) in.readValue((Object.class.getClassLoader())));
        this.stickied = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.canGild = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.thumbnailHeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parentWhitelistStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.spoiler = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.permalink = ((String) in.readValue((String.class.getClassLoader())));
        this.subredditType = ((String) in.readValue((String.class.getClassLoader())));
        this.locked = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hideScore = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.created = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.whitelistStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.quarantine = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.createdUtc = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.subredditNamePrefixed = ((String) in.readValue((String.class.getClassLoader())));
        this.ups = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.media = ((Media) in.readValue((Media.class.getClassLoader())));
        this.numComments = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isSelf = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.visited = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.numReports = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isVideo = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.distinguished = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Data_() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Object getApprovedAtUtc() {
        return approvedAtUtc;
    }

    public void setApprovedAtUtc(Object approvedAtUtc) {
        this.approvedAtUtc = approvedAtUtc;
    }

    public Object getBannedBy() {
        return bannedBy;
    }

    public void setBannedBy(Object bannedBy) {
        this.bannedBy = bannedBy;
    }

    public MediaEmbed getMediaEmbed() {
        return mediaEmbed;
    }

    public void setMediaEmbed(MediaEmbed mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public Object getSelftextHtml() {
        return selftextHtml;
    }

    public void setSelftextHtml(Object selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public Object getLikes() {
        return likes;
    }

    public void setLikes(Object likes) {
        this.likes = likes;
    }

    public Object getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(Object suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public List<Object> getUserReports() {
        return userReports;
    }

    public void setUserReports(List<Object> userReports) {
        this.userReports = userReports;
    }

    public SecureMedia getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(SecureMedia secureMedia) {
        this.secureMedia = secureMedia;
    }

    public Boolean getIsRedditMediaDomain() {
        return isRedditMediaDomain;
    }

    public void setIsRedditMediaDomain(Boolean isRedditMediaDomain) {
        this.isRedditMediaDomain = isRedditMediaDomain;
    }

    public Object getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(Object linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getBannedAtUtc() {
        return bannedAtUtc;
    }

    public void setBannedAtUtc(Object bannedAtUtc) {
        this.bannedAtUtc = bannedAtUtc;
    }

    public Object getViewCount() {
        return viewCount;
    }

    public void setViewCount(Object viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public Object getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(Object reportReasons) {
        this.reportReasons = reportReasons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumCrossposts() {
        return numCrossposts;
    }

    public void setNumCrossposts(Integer numCrossposts) {
        this.numCrossposts = numCrossposts;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public List<Object> getModReports() {
        return modReports;
    }

    public void setModReports(List<Object> modReports) {
        this.modReports = modReports;
    }

    public Boolean getCanModPost() {
        return canModPost;
    }

    public void setCanModPost(Boolean canModPost) {
        this.canModPost = canModPost;
    }

    public Boolean getIsCrosspostable() {
        return isCrosspostable;
    }

    public void setIsCrosspostable(Boolean isCrosspostable) {
        this.isCrosspostable = isCrosspostable;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Object getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Object getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(Object linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public Object getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(Object authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public Boolean getContestMode() {
        return contestMode;
    }

    public void setContestMode(Boolean contestMode) {
        this.contestMode = contestMode;
    }

    public Integer getGilded() {
        return gilded;
    }

    public void setGilded(Integer gilded) {
        this.gilded = gilded;
    }

    public Integer getDowns() {
        return downs;
    }

    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Boolean getBrandSafe() {
        return brandSafe;
    }

    public void setBrandSafe(Boolean brandSafe) {
        this.brandSafe = brandSafe;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    public Object getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(Object removalReason) {
        this.removalReason = removalReason;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public Object getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(Object authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public Boolean getStickied() {
        return stickied;
    }

    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    public Boolean getCanGild() {
        return canGild;
    }

    public void setCanGild(Boolean canGild) {
        this.canGild = canGild;
    }

    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getHideScore() {
        return hideScore;
    }

    public void setHideScore(Boolean hideScore) {
        this.hideScore = hideScore;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Integer createdUtc) {
        this.createdUtc = createdUtc;
    }

    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Integer getNumComments() {
        return numComments;
    }

    public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Object getNumReports() {
        return numReports;
    }

    public void setNumReports(Object numReports) {
        this.numReports = numReports;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public Object getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(domain);
        dest.writeValue(approvedAtUtc);
        dest.writeValue(bannedBy);
        dest.writeValue(mediaEmbed);
        dest.writeValue(thumbnailWidth);
        dest.writeValue(subreddit);
        dest.writeValue(selftextHtml);
        dest.writeValue(selftext);
        dest.writeValue(likes);
        dest.writeValue(suggestedSort);
        dest.writeList(userReports);
        dest.writeValue(secureMedia);
        dest.writeValue(isRedditMediaDomain);
        dest.writeValue(linkFlairText);
        dest.writeValue(id);
        dest.writeValue(bannedAtUtc);
        dest.writeValue(viewCount);
        dest.writeValue(archived);
        dest.writeValue(clicked);
        dest.writeValue(reportReasons);
        dest.writeValue(title);
        dest.writeValue(numCrossposts);
        dest.writeValue(saved);
        dest.writeList(modReports);
        dest.writeValue(canModPost);
        dest.writeValue(isCrosspostable);
        dest.writeValue(pinned);
        dest.writeValue(score);
        dest.writeValue(approvedBy);
        dest.writeValue(over18);
        dest.writeValue(hidden);
        dest.writeValue(preview);
        dest.writeValue(thumbnail);
        dest.writeValue(subredditId);
        dest.writeValue(edited);
        dest.writeValue(linkFlairCssClass);
        dest.writeValue(authorFlairCssClass);
        dest.writeValue(contestMode);
        dest.writeValue(gilded);
        dest.writeValue(downs);
        dest.writeValue(brandSafe);
        dest.writeValue(secureMediaEmbed);
        dest.writeValue(removalReason);
        dest.writeValue(postHint);
        dest.writeValue(authorFlairText);
        dest.writeValue(stickied);
        dest.writeValue(canGild);
        dest.writeValue(thumbnailHeight);
        dest.writeValue(parentWhitelistStatus);
        dest.writeValue(name);
        dest.writeValue(spoiler);
        dest.writeValue(permalink);
        dest.writeValue(subredditType);
        dest.writeValue(locked);
        dest.writeValue(hideScore);
        dest.writeValue(created);
        dest.writeValue(url);
        dest.writeValue(whitelistStatus);
        dest.writeValue(quarantine);
        dest.writeValue(author);
        dest.writeValue(createdUtc);
        dest.writeValue(subredditNamePrefixed);
        dest.writeValue(ups);
        dest.writeValue(media);
        dest.writeValue(numComments);
        dest.writeValue(isSelf);
        dest.writeValue(visited);
        dest.writeValue(numReports);
        dest.writeValue(isVideo);
        dest.writeValue(distinguished);
    }

    public int describeContents() {
        return  0;
    }

}
